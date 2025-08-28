public class WaterLavelTrappimg {
    public static int TrapedRainWater(int height[]){
        int n =height.length;
        int leftmaxboundary[] = new int[n];
        leftmaxboundary[0]=height[0];
        for(int i=1; i<n; i++){
            leftmaxboundary[i] =Math.max(height[i],leftmaxboundary[i-1]);
        }

        int rightmaxboundary[] = new int[n];
        rightmaxboundary[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmaxboundary[i] = Math.max(height[i],rightmaxboundary[i+1]);
        }

        int trappedWater =0;
        for(int i=0; i<n; i++){
            int waterlevel=Math.min(leftmaxboundary[i],rightmaxboundary[i]);
            trappedWater +=waterlevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] ={4,2,0,6,3,2,5};
        System.out.println(TrapedRainWater(height));
    }
    
}

//Time complexity =o(n);
