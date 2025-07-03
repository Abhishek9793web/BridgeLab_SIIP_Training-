public class singly_LL {
      Node head;
      Node tail;

      class Node{
          Object data;
          Node next;

          Node(Object data){
              this.data=data;
              this.next=null;
          }

      }
      //add in the end
      public  void add(Object data){
          Node n=new Node(data);

          if(head==null){
              head=tail=n;
          }
          else{
              tail.next=n;
              tail=n;
          }
      }
      // add first
    public void addFirst(Object data){
          Node n=new Node(data);

          if(head==null){
              head=tail=n;
          }
          else{
              n.next=head;
              head=n;
          }
    }
   //delete in LL
    public void delete(){
          if(head==null){
              System.out.println("List is empty");
              return;
          }
          if(head.next==null){
              head=tail=null;
          }else{
              Node temp=head;
              while (temp.next !=tail){
                  temp=temp.next;
              }
              temp.next=null;
              tail=temp;

          }
    }

    //add in Middle
    public void addMiddle(Object data){
        Node n=new Node(data);

        if(head==null){
            head=tail=n;
        }
        else{

        }

    }


      public void display(){
          Node temp=head;
          while (temp !=null){
              System.out.print(temp.data+"->");
              temp=temp.next;
          }
          System.out.println("null");
      }




}
 class Main{
    public static void main(String[] args) {
        singly_LL l1=new singly_LL();
        l1.add(1);
        l1.add(2);
        l1.addFirst(0);
        l1.display();

        l1.delete();
        l1.display();
    }
}
