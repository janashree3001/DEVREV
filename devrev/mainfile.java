class sol{
    public static void main(String[] args) {
      sign_in signin = new sign_in();
      signin.setval("janashree", "12345");
      maps map= new maps();
      map.mapping("janashree","12345");
      map.mapping("jana","123456");
      if(map.check("jana", "1234567")){
        System.out.println("Welcome");
      }
      else{
        System.out.println("Pls check!!!");
      }
      area ar = new area();
      ar.writing("delhi", "no", "yes");
      ar.writing("chennai", "no", "yes");
      ar.writing("trichi", "yes", "yes");
      /*view_place_book book= new view_place_book();
      book.booking("delhi");
      book.booking("delhi");
      //System.out.println(signin.getval());
      //login_site login = new login_site();*/
      
    }
}
