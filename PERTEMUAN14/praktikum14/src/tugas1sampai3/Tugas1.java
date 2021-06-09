/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1sampai3;

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class Tugas1 {
   
int vertex;
LinkedList list[];

public Tugas1(int vertex) {
this.vertex = vertex;
list = new LinkedList[vertex];
for (int i = 0; i < vertex; i++) {
 list[i] = new LinkedList();   
}
}

public void addEdge(int source, int destination){
list[source].addFirst(destination);
list[destination].addFirst(source);
}

public void degree(int source) throws Exception {
System.out.println("degree vertex " + source + " : " + list[source].size());
int k, totalIn = 0, totalOut = 0;
for (int i = 0; i < vertex; i++) {
for (int j = 0; j < list[i].size(); j++) {
if (list[i].get(j) == source)
++totalIn;
}
for (k = 0; k < list[source].size(); k++) {
list[source].get(k);
}
totalOut = k;
}
System.out.println("Indegree dai vertex " + source + " : " + totalIn);
System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
}

public void removeEdge(int source, int destination) throws Exception {
for (int i = 0; i < vertex; i++) {
if (i == destination) {
list[source].remove(destination);
}
}
}

public void removeAllEdges() {
for (int i = 0; i < vertex; i++) {
list[i].clear();
}
System.out.println("Graph berhasil dikosongkan");
}

public void printGraph() throws Exception {
for (int i = 0; i < vertex; i++) {
if (list[i].size() > 0) {
System.out.print("Vertex " + i + " terhubung dengan: ");
for (int j = 0; j < list[i].size(); j++) {
System.out.print(list[i].get(j) + " ");
}
System.out.println("");
}
}
System.out.println(" ");
}

public static void main (String[] args) throws Exception {
int count = 1, to, from;
Tugas1 graph = new Tugas1(6);
Scanner input = new Scanner(System.in);
System.out.print("Masukkan jumlah inputan lintasan : ");
int jumlah = input.nextInt();
System.out.println("------------------------------------");
System.out.println("Masukkan edges: ");
while (count <= jumlah) {
to = input.nextInt();
from = input.nextInt();
graph.addEdge(to, from);
count++;
}
System.out.println("");
graph.printGraph(); //memanggil method printGraph
graph.degree(2); //memanggil method degree
graph.removeEdge(1, 2);
graph.printGraph(); //memanggil method printGraph
} 
}
