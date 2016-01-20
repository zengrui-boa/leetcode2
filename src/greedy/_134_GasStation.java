package greedy;

/**
 * ע��̰���㷨
 * @author founder
 *
 */

public class _134_GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		if (gas.length == 0 || cost.length == 0 || gas.length != cost.length) {
			return -1;
		}
		int tank = 0, total = 0, start = 0;
		for (int i = 0; i < gas.length; ++i) {

			total += (gas[i] - cost[i]);	//��¼�������̵ĺ������
			tank += (gas[i] - cost[i]);	    //��¼�����е�ʣ����
			if (tank < 0) {					//����������0ʱ��������㣬iǰ��Ľڵ�����ܲ�Ϊ��㣬���ػص���ͷ�㡣����������е�����
				start = i + 1;
				tank = 0;
			}

		}
		return total < 0 ? -1 : start;		//�ж��������̵��ͺ��Ƿ�С��0��ֻҪ�ͺ�>=0����һ��������ʼ�㡣
	}

}
