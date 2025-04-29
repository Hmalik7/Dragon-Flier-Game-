/**
 * Malik Harsh 
 * Array List Class
 * CSS 143
 */


class ArrayList <E>
{

    private static class Node <T>
 // this will be private and will ensure that no privacy leaks happen
 {
  T first;
  Node<T> next;

  Node(T h,Node<T> t)
  {
   first=h;
   next=t;
  }
 }
/**
 * I am using Linked List which will be an implementation of my ArrayList.
 */
 private Node<E> myLst;
 private Node<E> beginning;
 private int node_count = 0;
 
 public ArrayList()
 {
  myLst=null;
  beginning = null;
 }

 
  public int size()
 {
  int count=0;
  for(Node<E> ptr=myLst; ptr!=null; ptr=ptr.next, count++) {}
  return count;
  /**
   * This int size will return the count of nodes in the linked list 
   */
 }
 
 
public boolean remove(E object)
/**
 * This method is used to remove the node from the linked list.
 */
 {
  if(myLst==null)
     return false;
  else if(object.equals(myLst.first))
     {
      myLst=myLst.next;
      return true;
     }
  else
     {
      Node<E> ptr=myLst;
      for(; ptr.next!=null&&!object.equals(ptr.next.first); ptr=ptr.next) {}
      if(ptr.next==null)
         return false;
      else
         {
          ptr.next = ptr.next.next;
          return true;
         }
     }
 }

 
 
 public void add(E object)
 {
     /**
      * this is method to insert another node to list.
      */
  if(myLst==null)
  {
     myLst = new Node<E>(object,null);
     beginning = myLst;
     node_count = node_count +1;
  }
  else
     {
      Node<E> ptr=myLst;
      for(; ptr.next!=null; ptr=ptr.next) {}
      ptr.next = new Node<E>(object,null);
      node_count = node_count + 1;
     }
 }
  
 
 public E remove(int location)
 {
  E object;
  /**
   * this method will be used to remove from the list
   */
  if(myLst==null)
     throw new IndexOutOfBoundsException();
  else if(location==0)
     {
      object=myLst.first;
      myLst=myLst.next;
      return object;
     }
  else
     {
      Node<E> ptr=myLst;
      for(int count=1; ptr.next!=null&&count<location; ptr=ptr.next,count++) {}
      if(ptr.next==null)
         throw new IndexOutOfBoundsException();
      object=ptr.next.first;
      ptr.next=ptr.next.next;
      return object;
     }
 }

 public void set(int location,E object)
 {
  Node<E> ptr=myLst;
  for(int count=0; count<location&&ptr!=null; ptr=ptr.next, count++) {}
  if(ptr==null)
     throw new IndexOutOfBoundsException();
  ptr.first=object;
 }

 

 
 public E get(int location)
 {
  Node<E> ptr=myLst;
  for(int count=0; count<location&&ptr!=null; ptr=ptr.next, count++) {}
  if(ptr==null)
     throw new IndexOutOfBoundsException();
  return ptr.first;
  /**
   * this will get the location of the node and has a exception of outofbounds.
   */
 }
 public int count()
 {
    return node_count; 
    /**
     * this will return the node count 
     */
 }
 public void clear()
 {
    myLst = null;
    beginning = null;
    node_count = 0;
 }
 

 public void add(int location,E object)
 {
  if(location==0)
     myLst = new Node<E>(object,myLst);
     /**
      * this is to add another node to the location you want at the linked list.
      */
  else
     {
      Node<E> ptr=myLst;
      for(int count=1; ptr!=null&&count<location; ptr=ptr.next,count++) {}
      if(ptr==null)
         throw new IndexOutOfBoundsException();
      ptr.next = new Node<E>(object,ptr.next);
     }
 }

/**
 * this method is for my string representation of the linked list.
 */
 public String toString()
 {
  String str="[";
  if(myLst!=null)
     {
      str+=myLst.first;
      for(Node<E> ptr=myLst.next; ptr!=null; ptr=ptr.next)
          str+=","+ptr.first;
     }
  return str+"]";
 }

 
 public int indexOf(E object)
 {
  int count=0;
  Node<E> ptr=myLst;
  for(; ptr!=null&&!object.equals(ptr.first); ptr=ptr.next, count++) {}
  if(ptr==null)
     return -1;
  else
     return count;
 }

 public int lastIndexOf(E object)
 {
  int location=-1;
  Node<E> ptr=myLst;
  for(int count=0; ptr!=null; ptr=ptr.next, count++)
      if(object.equals(ptr.first))
         location=count;
  return location;
 }

 
 
}