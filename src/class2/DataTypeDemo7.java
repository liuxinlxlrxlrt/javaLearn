package class2;

/*
 * ˼���⣺
 *    byte b = 130;��û������?��������ø�ֵ��ȷ��������ô��?����Ƕ�����?
 *    
 * 
 * 
 *    ��ϰ��byte b = 300;
 */
public class DataTypeDemo7 {
     public static void main(String[] args) {
    	 //��Ϊbyte�ķ�Χ��-128��127
    	 //��130���ڴ˷�Χ�ڣ����Ա���
    	 //byte b = 130;
    	 
    	 //�����ң�����ʹ��ǿ������ת��
    	 byte b = (byte) 130;
    	 
    	 //����Ƕ����أ�
    	 System.err.println(b);
	}
}
/*�������̣�
 *      ����Ҫ��֪�������ʲô����Ӧ��֪������ν��м���ġ�
 *      ��������֪������������ݵ����㶷���ǲ�����е�
 *      ��Ҫ�õ����룬����Ҫ��������ݵĶ�����
 *      
 *      A����ȡ130(int����4�ֽ�)������ݵĶ�����
 *          00000000 00000000 00000000 10000010
 *          �����130��ԭ�룬Ҳ�Ƿ��룬Ҳ�ǲ���
 *      B: ����ȡ�������س�byte����(1���ֽ�)����
 *         10000010
 *         �������ǲ���
 *      C����֪���룬��ԭ��
 *                ����λ       ��ֵλ
 *        ���룺      1        0000010
 *        ���룺      1        0000001
 *        ԭ�룺       1        1111110
 *        1 1111110= - (1*2^6+1*2^5+1*2^4+1*2^3+1*2^2+1*2^1+0*2^0)
 *                 =-(64+32+16+8+4+2+0)
 *                 =-126
 *                 
 *       2^0 2^1 2^2  2^3  2^4  2^5  2^6  2^7  2^8
 *        1   2   4   8   16  32  64  128 356
 *      
 */
