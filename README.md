# 📘 HashTable & Binary Search Tree – Java Implementation (No Recursion)

## 📌 Description

This project implements two fundamental data structures in Java **without using recursion**: 🧮 `MyHashTable<K, V>` — a hash table with separate chaining; 🌳 `BST<K, V>` — a binary search tree with in-order traversal using iteration.

## 📁 Project Structure

src/: MyHashTable.java, MyTestingClass.java, Student.java, TestHashTable.java, BST.java, TestBST.java

## ✅ Features

🔹 MyHashTable: Custom class `HashNode<K, V>`; Methods: `put`, `get`, `remove`, `contains`, `getKey`, `bucketSizes`; `MyTestingClass` includes manual `hashCode()`; Inserted 10,000 random elements and counted bucket sizes.

🔹 BST: Methods: `put`, `get`, `size`, `iterator`; In-order traversal using stack, no recursion; Iterator returns `Map.Entry<K, V>` for key-value access.

## 🧪 Sample Usage

for (var entry : tree) { System.out.println("key is " + entry.getKey() + " and value is " + entry.getValue()); }


