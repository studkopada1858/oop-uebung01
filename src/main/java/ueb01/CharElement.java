package ueb01;

public class CharElement {

    char c;
        CharElement next;

        public CharElement (char c, CharElement next){
            this.c=c; 
            this.next=next;
        }
        public char value(){
            return c;

        }
    }

