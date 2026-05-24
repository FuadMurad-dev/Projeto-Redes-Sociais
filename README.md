# Social Networks Project

## Overview

This Java project models a simple social network system using inheritance, interfaces, and exception handling. It demonstrates how different social network platforms share common behavior through an abstract base class while also implementing their own platform-specific features.

## Features

- Abstract base class `RedeSocial` with core social network methods:
  - `postarFoto()`
  - `postarVideo()`
  - `postarComentario()`
  - `curtirPublicacao()`
- Platform-specific implementations for:
  - `Facebook`
  - `Instagram`
  - `Twitter`
  - `GooglePlus`
- Interfaces for optional capabilities:
  - `Compartilhamento` for sharing content
  - `VideoConferencia` for streaming/video conference functionality
- `Usuario` class that validates social network accounts and stores a collection of connected platforms
- Custom exception classes:
  - `CheckedException`
  - `UnchekedException`

## Project Structure

- `src/Funcionalidade`
  - `Main.java` - entry point of the application
  - `RedeSocial.java` - abstract base class for social networks
  - `Facebook.java`, `Instagram.java`, `Twitter.java`, `GooglePlus.java` - concrete social network implementations
  - `Usuario.java` - user model with account validation
  - `Compartilhamento.java` - sharing interface
  - `VideoConferencia.java` - streaming/video conference interface
- `src/Excecoes`
  - `CheckedException.java`
  - `UnchekedException.java`

## How to Run

1. Make sure you have Java installed (JDK 8 or later).
2. Compile the source files. From the project root, run:

```bash
javac -d out src/Excecoes/*.java src/Funcionalidade/*.java
```

3. Run the application:

```bash
java -cp out Funcionalidade.Main
```

## What the Application Does

The `Main` class creates instances of social network platforms and a `Usuario` object. It then calls example methods such as:

- `fazStreaming()` on Facebook
- `compartilhar()` on Facebook
- `postarComentario()` on Facebook
- `postarFoto()` and `postarVideo()` on Instagram
- `curtirPublicacao()` on Instagram

The `Usuario` constructor checks for null social network accounts and throws a checked exception if any account is missing.
