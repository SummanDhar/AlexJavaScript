public class reversebit {
    public int reverseBit(int num){
        num = ((num & 0xffff0000) >>> 16) |  ((num & 0x0000ffff) << 16);
        num = ((num & 0xff00ff00) >>> 8)  |   ((num & 0x00ff00ff) << 8);
        num = ((num & 0xf0f0f0f0) >>> 4)  |   ((num  & 0x0f0f0f0f) << 4);
        num = ((num & 0xcccccccc) >>> 2)  |   ((num & 0x33333333) << 2);
        num = ((num & 0xaaaaaaaa) >> 1)   |    ((num & 0x55555555) << 1);
        return num;
    }
    public static void main(String[] args) {
        reversebit solution = new reversebit();
        
        // Input: n = 00000010100101000001111010011100
        int input = 0b00000010100101000001111010011100;
        
        int output = solution.reverseBit(input);
        
        System.out.println("Input:  " + Integer.toBinaryString(input));
        System.out.println("Output: " + output);
        System.out.println("Binary: " + String.format("%32s", Integer.toBinaryString(output)).replace(' ', '0'));
    }
}
