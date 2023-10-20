# Projeto de APIRestful para registrar coleção de mangá

Esse projeto foi criado durante o Santander Bootcamp 2023 - FullStack Angular + Java.

### Diagrama de Classes

```mermaid
classDiagram
  class Manga {
    - name: String
    - author: String
    - art: String
    - volume: String
    - publisher: String
    - edition: String
    - datePublication: String
    - demographic: String
    - features: Feature[]
    - languages: Language[]
    - genres: String[]
  }

  class Feature {
    - coverImage: String
    - description: String
  }

  class Language {
    - originalLang: String
    - translationLang: String
  }

  Manga *-- Feature : has
  Manga *-- Language : has


´´´
