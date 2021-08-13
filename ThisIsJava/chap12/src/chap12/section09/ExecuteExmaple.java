package chap12.section09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExmaple {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//�ִ� ������ ������ 2�� ������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 10; i++) {
			// �۾� ����
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����: " + poolSize + "] �۾� ������ �̸�: " + threadName);
					// ���� �߻� ��Ŵ
					int value = Integer.parseInt("��");
				}
			};
			
			// �۾� ó�� ��û
			executorService.execute(runnable);
			//executorService.submit(runnable);			
			
			// �ֿܼ� ��� �ð��� �ֱ� ���� 0.01�� �Ͻ� ����
			Thread.sleep(10);
		}
		executorService.shutdown();
	}

}