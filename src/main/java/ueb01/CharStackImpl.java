package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack{

    CharElement top;


    @Override
    public void push(char c){
        top=new CharElement(c,top);

    }

    @Override
    public char pop() {
        if(top==null){
            throw new NoSuchElementException();
        }
        char rem=top.value();
        top=top.next;
        return rem;
    }

    @Override
    public int size() {
        int n = 0;
        CharElement it = top;
        while (it != null) {
            n++;
            it = it.next;
        }
        return n;
    }
}
