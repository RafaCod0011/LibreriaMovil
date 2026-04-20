# 📚 Trabajo Práctico 3 – Buscador de Libros

Aplicación Android que permite buscar libros de una lista y ver sus detalles en una segunda Activity.

---

## 🎯 Objetivo

Desarrollar una aplicación con **dos Activities** aplicando el patrón **MVVM** y haciendo uso de **ViewBinding**.

---

## 📌 Descripción

La aplicación muestra una lista de libros usando **RecyclerView**.  
El usuario puede buscar por título y al pulsar sobre el boton buscar se abre una segunda Activity con todos sus detalles.

---

## ✨ Funcionalidades

- **Búsqueda principal:** Campo de texto  buscar libros por su título.
- **Autocompletado:** Al hacer clic sobre un ítem (libro) de la lista, el buscador se carga automáticamente con el nombre seleccionado.
- **Vista de Detalle:** Al accionar la búsqueda, se navega a una segunda Activity que expone la portada, sinopsis, autor, año, cantidad de páginas y géneros del libro.
- **UI Moderna:** Implementación de `RecyclerView` (incluyendo `GridLayoutManager` para los géneros) y `CardView` personalizados.

---

## 🏗️ Implementación MVVM

- **Model**: Clase `Libro` y `LibroData` (lista de libros)
- **ViewModel**: `MainViewModel` (carga y filtra la lista)
- **View**: `MainActivity` y `DetalleActivity` 

---

## 📂 Estructura del Proyecto
El proyecto sigue una organización basada en paquetes para separar las responsabilidades de la arquitectura MVVM:

- modelo/: Contiene la clase de datos Libro.

- repositorio/: Clase LibroRepositorio encargada de gestionar el acceso a los datos (la lista de libros).

**Views (Activities):**

- BuscadorActivity: Pantalla principal de búsqueda.

- DetalleActivity: Pantalla de detalles del libro seleccionado.

**ViewModels:**

- BuscadorActivityViewModel: Lógica y filtrado para el buscador.

- DetalleActivityViewModel: Gestión de datos para la vista de detalle.

**Adapters:**

- LibroAdapter: Adaptador para la lista principal de libros.

- GeneroAdapter: Adaptador para la lista de géneros dentro del detalle.

- res/layout/: Archivos XML de diseño (activities e items de las listas).

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
