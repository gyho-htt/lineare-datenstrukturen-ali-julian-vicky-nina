public class Stack<ContentType>{

    class Node{
        private Node drunterliegend;
        private ContentType inhalt;

        public Node(ContentType pInhalt){
            this.inhalt = pInhalt;
        }
        public ContentType getInhalt(){
            return this.inhalt;
        }
        public Node getDrunterliegend(){
            return this.drunterliegend;
        }
        public void setDrunterliegend(Node pDrunterLiegend){
            this.drunterliegend = pDrunterLiegend;
        }
    }

    private Node top;

    public Stack(){
        this.top = null;
    }

    public void push(ContentType pContent) {
        if (pContent != null) {
            Node zwischenspeicher = new Node(pContent);
            if (!isEmpty()) {
                zwischenspeicher.setDrunterliegend(top);
            }
            zwischenspeicher = top;
        } else {
            System.out.println("Warum möchtest du nichts auf einen Stapel tun? Du Idiot!");
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Du kannst nichts entfernen, wenn nichts da ist!");
        } else {
            top.getDrunterliegend() = top;
        }
    }
    public boolean isEmpty(){
     if(this.top == null){
         return true;
     }
     return false;
    }
    public ContentType top(){
        return this.top;
    }
}