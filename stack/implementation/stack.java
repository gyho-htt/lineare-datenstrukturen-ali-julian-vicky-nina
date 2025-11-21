public class stack <ContentType> {

  private class stackNode{
    private ContentType content = null;
    private stackNode nextNode = null;
  
    public stackNode(ContentType pContent) {
      content = pContent;
      nextNode = null;
    }
    
    public void setNext(stackNode pNext) {
      nextNode = pNext;
    }
    
    public stackNode getNext() {
      return nextNode;
    }
    
    public ContentType getContent() {
      return content;
    }
    
  }

  private stackNode head;
  
  public stack() {
    head = null;
  }
  
  public boolean isEmpty() {
    return head == null;
  }

  public void push(ContentType pContent) {
    if (pContent != null) {
      stackNode newNode = new stackNode(pContent);
      newNode.setNext(head);
      head = newNode;
    }
  }
  
  public void pop() {
    if (!this.isEmpty()) {
      head = head.getNext();
      if (this.isEmpty()) {
        head = null;
      }
    }
  }
  
  public ContentType top() {
    if (this.isEmpty()) {
      return null;
    } else {
      return head.getContent();
    }
  }
  
}