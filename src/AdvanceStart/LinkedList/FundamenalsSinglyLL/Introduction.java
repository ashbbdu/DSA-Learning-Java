package AdvanceStart.LinkedList.FundamenalsSinglyLL;



public class Introduction {
   static class Node {
        String name ;
        String email ;
        Node (String _name , String _email) {
            this.name = _name;
            this.email = _email;
        }
    }
    public static void main(String[] args) {
        Node n1 = new  Node("ashish" , "ashish@gmail.com");
        System.out.println(n1.name);
        System.out.println(n1.email);
    }
}
