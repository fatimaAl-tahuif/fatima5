public class Q3 {
    public static void main(String[] args) {
     doulayLinkedList<Integer>L=new doulayLinkedList<>();
       doulayLinkedList<Integer>M=new doulayLinkedList<>();
        doulayLinkedList<Integer>K=new doulayLinkedList<>();
        L.addFirst(11);
        L.addlast(12);

        M.addFirst(16);
        M.addlast(11);

        K.addFirst(11);
        K.addlast(12);

        if (L.equals(L,M))
            System.out.println("list M and list L equals" );
        else
            System.out.println("list M and list L not equals" );

        if (K.equals(L,K))
            System.out.println("list M and list L equals" );
        else
            System.out.println("list K and list L not equals" );
    }
}
/*
إنشاء 3 قوائم مرتبطة ثنائية الاتجاه.
إضافة عناصر مختلفة إلى كل قائمة.
مقارنة القوائم باستخدام طريقة equals.
طباعة رسالة تشير إلى تساوي أو عدم تساوي القوائم.


 */