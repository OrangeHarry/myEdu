package com.harry.nestedinterface;

public class Anonymous {
	RemoConEx fieldRemoConEx = new RemoConEx() {// �ʵ� �ʱⰪ���� �ʵ忡 ������ �Ѵ�.

		@Override
		public void setOn() {
			// TODO Auto-generated method stub
			System.out.println("Anonymous field TV Set On");
		}

		@Override
		public void setOff() {
			// TODO Auto-generated method stub
			System.out.println("Anonymous field TV Set Off");
		}
	};

	void method01() {// ���� ����������..���� �����Ʒ����� ������ �Ǿ����ϴ�.
		RemoConEx localRemoConEx = new RemoConEx() {

			@Override
			public void setOn() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous local Radio Set On");
			}

			@Override
			public void setOff() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous local Radio Set Off");
			}
		};
		localRemoConEx.setOn();// ���ú����� ���..
	}

	void method02(RemoConEx remoConEx) {// interface�� �Ű� ������ ���� �� �ִ� �޼ҵ�� ���ǵǾ����ϴ�.
		remoConEx.setOn();
	}
}
