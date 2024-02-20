public class Q1 {
   public static void main(String[] args) {
      doulayLinkedList<Integer>list=new doulayLinkedList<>();

      list.addFirst(11);
      list.addlast(12);
      list.addlast(13);
      list.addlast(14);
      list.addlast(15);


      System.out.println("Size of list: "+list.size());
      System.out.println("element of middle node: "+list.findMiddle(list).element);

   }

   }
/*
هذا الكود ينفذ جزءًا من برنامج يضيف أرقامًا إلى قائمة مرتبطة ثنائية الاتجاه (doubly linked list) ثم يجد عنصر العقدة الوسطى في القائمة ويطبعه.
ينفذ الكود جزءًا من برنامج لإيجاد عنصر العقدة الوسطى في قائمة مرتبطة ثنائية الاتجاه.
نحتاج إلى شرح كامل لفئة doulayLinkedList لفهم كيفية عمل الكود بشكل كامل.
 */