Markdown# 📚 Trabajo Práctico 3 – Buscador de Libros

Aplicación Android que permite buscar libros de una lista y ver sus detalles en una segunda Activity.

---

## 🎯 Objetivo

Desarrollar una aplicación con **dos Activities** aplicando el patrón **MVVM** y haciendo uso de **ViewBinding**.

---

## 📌 Descripción

La aplicación muestra una lista de libros usando **RecyclerView**.  
El usuario puede buscar por título y al pulsar sobre un libro se abre una segunda Activity con todos sus detalles.

---

## ✨ Funcionalidades

- ✅ Lista de 10 libros precargados
- ✅ Búsqueda en tiempo real por título
- ✅ RecyclerView con tarjetas (CardView)
- ✅ Navegación a pantalla de detalle al hacer clic en un libro
- ✅ Implementación completa con **MVVM** y **ViewBinding**

---

## 🏗️ Implementación MVVM

- **Model**: Clase `Libro` y `LibroData` (lista de libros)
- **ViewModel**: `MainViewModel` (carga y filtra la lista)
- **View**: `MainActivity` y `DetalleActivity` (solo observan datos y manejan eventos)

---

## 🚀 Cómo ejecutar el proyecto

1. Clonar el repositorio
2. Abrir el proyecto en Android Studio
3. Esperar que Gradle sincronice
4. Ejecutar en emulador o dispositivo físico

---

## 👥 Integrantes del grupo

- Facundo Martín García – DNI: 28399283
- Victor Angel Aguilera – DNI: 36220045
- Rafael Nicolas Cuello – DNI: 39396258
- Martin Nahuel Becerra – DNI: 47266622

---