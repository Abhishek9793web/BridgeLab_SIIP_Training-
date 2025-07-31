import java.io.*;

public class Buffered_Streams {
    public static void main(String[] args) {
        long stratime=System.nanoTime();
        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Streams/src/source.txt"));
            BufferedOutputStream bos=new BufferedOutputStream((new FileOutputStream("Streams\\src\\destination.txt")))){
            byte[] buffer=new byte[4096];

            int byteread;
            while ((byteread=bis.read(buffer))!=-1){
                bos.write(buffer,0,byteread);

            }
            System.out.println("file copyed successfully");


        }
        catch (IOException e){
            e.printStackTrace();
        }
        long endtime=System.nanoTime();
        System.out.println("time taken "+ (endtime-stratime)+" nanosec");
        System.out.println("time taken "+(endtime-stratime)/1000000+" milisec");
        System.out.println("time taken "+(endtime-stratime)/1000000000+" sec");
        System.out.println("time taken "+(endtime-stratime)/1000000000/60+" min");





    }
}
