package day11;
/*
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 * ˼·��
 * 
 */

public class Solution {
	public static void main(String[] args) {
		int[] sequnce ={4,6,7,5};
		System.out.println(VerifySquenceOfBST(sequnce));
	}
    public static boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence.length==0)
    		return false;
        if(sequence.length==1)
    		return true;
    	int root=sequence[sequence.length-1];
    	int index=-1;
    	for (int i = 0; i < sequence.length; i++) {
    		
			if(sequence[i]>=root){
				index=i-1;
				break;
			}
			
		}
    	if(index==-1){
    		int[] a=new int[sequence.length-1];
    		for (int i = 0; i < sequence.length-1; i++) {
				if(sequence[i]<root)
					return false;
				a[i]=sequence[i];
			}
    		return VerifySquenceOfBST(a);
    	}else{
    		int[] a1=new int[index+1];
    		
        	
        	for (int i = 0; i <= index; i++) {
    			a1[i]=sequence[i];
    		}
        	if((sequence.length-1-index-1)!=0){
        		int[] b=new int[sequence.length-1-index-1];
            	for (int i = 0; i <b.length; i++) {
            		if(sequence[index+1+i]<root)
            			return false;
        			b[i]=sequence[index+1+i];
        		}
                return  VerifySquenceOfBST(a1)&&VerifySquenceOfBST(b);
        	}
        	return VerifySquenceOfBST(a1);
        	
    	}
    	
    }
}