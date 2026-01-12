public class ProcessorApp {
    public static void main(String[] args){
        MarksProcessor m1 = new MarksProcessor();
        try{
            double percentage = m1.calculatePercent(new String[]{"50", "bv"});
            System.out.println(percentage);
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
