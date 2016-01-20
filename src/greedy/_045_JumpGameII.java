package greedy;

/**
 * 
 * @author founder
 * 
 */
public class _045_JumpGameII {
	public int jump(int[] nums) {
		if (nums == null || nums.length <= 0) {
			return -1;
		}
		if (nums.length == 1) {
			return 0;
		}
		int curD = 0;	//��¼Ŀǰ�ܵ������Զ����
		int lastD = 0;	//��¼��һ����ǰ�ܵ������Զ����
		int step = 0;	//��¼���貽��

		for (int i = 0; i < nums.length; i++) {
			if(i > curD){	//�����ǰ�����ľ��볬����curD,�򷵻�-1
                return -1;
            }
			if (i > lastD) {	//�����ǰ�����ľ��볬����lastD���ܴﵽ�ľ��룬�����lastD,������һ
				lastD = curD;
				step++;
			}
			curD = Math.max(curD, nums[i] + i);	//ÿ�θ��²�����ֻ��lastD������ʱ���õ�
		}
		return step;
	}

}
