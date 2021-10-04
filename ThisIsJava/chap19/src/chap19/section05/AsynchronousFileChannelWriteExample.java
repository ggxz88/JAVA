package chap19.section05;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousFileChannelWriteExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		for (int i = 0; i < 10; i++) {
			Path path = Paths.get("C:/Temp/file" + i + ".txt");
			Files.createDirectories(path.getParent());
			
			//�񵿱� ���� ä�� ����
			AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(
				path, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE), executorService
			);
			
			//���Ͽ� ������ �����͸� ByteBuffer�� ����
			Charset charset = Charset.defaultCharset();
			ByteBuffer byteBuffer = charset.encode("�ȳ��ϼ���");
			
			//÷�� ��ü ����
			class Attachment {
				Path path;		//���� ��� ����
				AsynchronousFileChannel fileChannel;	//�񵿱� ���� ä�� ����
			}
			Attachment attachment = new Attachment();
			attachment.path = path;
			attachment.fileChannel = fileChannel;
			
			//CompletionHandler
			CompletionHandler<Integer, Attachment> completionHandler = 
				new CompletionHandler<Integer, Attachment>() {
				@Override
				public void completed(Integer result, Attachment attachment) {
					System.out.println(attachment.path.getFileName() + " : " + result + " bytes written : " 
							+ Thread.currentThread().getName());
					try {
						attachment.fileChannel.close();
					} catch (IOException e) {
						
					}
				}

				@Override
				public void failed(Throwable exc, Attachment attachment) {
					// TODO Auto-generated method stub
					exc.printStackTrace();
					try {
						attachment.fileChannel.close();
					} catch (IOException e) {
						
					}
				}	
				
			};
			//		���� �����͸� ������ ���� ��ü, ���� �ε���, ÷�� ��ü, �ݹ� �޼ҵ带 ���� ��ü
			fileChannel.write(byteBuffer, 0, attachment, completionHandler);
	
		}
		//������Ǯ ����
		Thread.sleep(1000);
		executorService.shutdown();
	}

}