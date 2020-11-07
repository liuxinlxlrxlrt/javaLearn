package class13_Integer;
/*
 * 看程序写结果
 * 
 * 注意：Integer的数据直接赋值，如果在-128到127之间，会直接从缓冲池获取数据
 */

public class IntegerTest {
	public static void main(String[] args) {
		Integer i1 =new Integer(127);
		Integer i2 =new Integer(127);
		System.out.println(i1==i2);//false
		System.out.println(i1.equals(i2));//true
		System.out.println("------------");
		
		Integer i3 =new Integer(128);
		Integer i4 =new Integer(128);
		System.out.println(i3==i4);//false
		System.out.println(i3.equals(i4));//true
		System.out.println("------------");
		
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5==i6);//false
		System.out.println(i5.equals(i6));//true
		System.out.println("------------");
		
		Integer i7 = 127;
		//Integer ii = Integer.valueOf(127);
		Integer i8 = 127;
		System.out.println(i7==i8);//true
		System.out.println(i7.equals(i8));//true
		
		//通过查看原码，我们知道了，针对-128到127之间的数据，组了一个数据缓冲池，入股数据是该范围内的，每次并不创建新的空间
		//Integer ii = Integer.valueOf(127);
		
//	    public static Integer valueOf(int i) {
//	        if (i >= IntegerCache.low && i <= IntegerCache.high)
//	            return IntegerCache.cache[i + (-IntegerCache.low)];
//	        return new Integer(i);
//	    }
//		private static class IntegerCache {
//	        static final int low = -128;
//	        static final int high;
//	        static final Integer cache[];
//
//	        static {
//	            // high value may be configured by property
//	            int h = 127;
//	            String integerCacheHighPropValue =
//	                sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
//	            if (integerCacheHighPropValue != null) {
//	                try {
//	                    int i = parseInt(integerCacheHighPropValue);
//	                    i = Math.max(i, 127);
//	                    // Maximum array size is Integer.MAX_VALUE
//	                    h = Math.min(i, Integer.MAX_VALUE - (-low) -1);
//	                } catch( NumberFormatException nfe) {
//	                    // If the property cannot be parsed into an int, ignore it.
//	                }
//	            }
//	            high = h;
//
//	            cache = new Integer[(high - low) + 1];
//	            int j = low;
//	            for(int k = 0; k < cache.length; k++)
//	                cache[k] = new Integer(j++);
//
//	            // range [-128, 127] must be interned (JLS7 5.1.7)
//	            assert IntegerCache.high >= 127;
//	        }
//
//	        private IntegerCache() {}
//	    }
	}
}
