class Main {
  public static void main(String[] args) {
    DLList L = new DLList();
    int i;
    int values[] = {34, 54, 78, 21, 12, 44, 90, 76, 93, 11, 65, 32};

    for (i = 0; i < 6; i++)
      L.insertAtHead(values[i]);
    for (i = 6; i < 12; i++)
      L.insertAtTail(values[i]);
    
    DLList.Node n = L.getFirst();

    while (n != null) {
      System.out.print(L.getData(n) + " ");
      n = L.getNext(n);
      //n=n.future();
    } // prints the list
    System.out.println("");

    L.deleteNode(78); // deletes first instance of 78

    n = L.find(44);
    L.deleteNode(L.getData(n)); // deletes first instance of 44
    
    n = L.getFirst();

    while (n != null) {
      System.out.print(L.getData(n) + " ");
      n = L.getNext(n);
    }
    System.out.println("");

    //Now, let's print the list backwards
    n = L.getFirst();
    while (L.getNext(n) != null)//issue near here
      n = L.getNext(n);
    
    while (n != null) {
      System.out.print(L.getData(n) + " ");
      n = L.getPrev(n);
    }
    System.out.println("");

    n = L.find(21);
    if (n != null)
      L.insertAfter(n, 77);
    else System.out.println("ERROR on find");

    n = L.getFirst();
    while (n != null) {
      System.out.print(L.getData(n) + " ");
      n = L.getNext(n);
    }
    System.out.println("");

  }
}