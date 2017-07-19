package sat14july;

/**
 * Created by brkar on 7/15/2017.
 */
public class ThreadCls {

    public static void main(String[] args) {

       Thread th =new Thread(()->{
           for (int i = 0; i <100 ; i++) {
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("The number is first thread ");
           }
       });


       Thread th2=new Thread(()->{

           for (int i = 0; i < 100 ; i++) {
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

               System.out.println("Then number is second thread ");
           }
       });

       th.start();
       th2.start();


    }
}
