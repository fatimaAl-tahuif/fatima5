public class Q2 {
    public static void main(String[] args) {
     doulayLinkedList<Integer>list=new doulayLinkedList<>();

        list.addFirst(11);
        list.addlast(12);
        list.addlast(13);
        list.addlast(14);
        list.addlast(15);

        System.out.println("Size of list: "+list.methodSize(list));
        System.out.println("Size of list: "+list.size());

    }
}
/*
إنشاء قائمة مرتبطة ثنائية الاتجاه (doulayLinkedList<Integer>).
إضافة عناصر (11-15) إلى القائمة.
طباعة حجم القائمة بطريقتين مختلفتين: باستخدام methodSize ثم size


ينفذ الكود جزءًا من برنامج لطباعة حجم قائمة مرتبطة ثنائية الاتجاه.
نحتاج إلى شرح طريقتَي methodSize و size لفهم كيفية عمل الكود بشكل كامل.
 */