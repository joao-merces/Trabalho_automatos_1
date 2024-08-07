# Toy Problem 2

## Descrição do problema

Numa pequena cidade com um hidrante em cada rua, há dois bombeiros. Quando ocorre 
um incêndio, um dos bombeiros se coloca ao lado do hidrante, e o outro ao lado do 
incêndio. O bombeiro ao lado do hidrante enche o balde e vai na direção do incêndio; o 
bombeiro ao lado do incêndio, uma vez esvaziado o balde, vai na direção do hidrante. 
Quando ambos se encontram, trocam de balde e de direção (o que vinha do hidrante 
volta para encher o balde vazio do colega; o que vinha do incêndio volta com o balde 
cheio que trazia o colega). Considere que, mesmo se o bombeiro que enche o balde seja:

1. Muito rápido, ele não chegará ao incêndio antes que o outro esvazie o seu;
2. Muito lento, ele já terá enchido o balde antes que seu colega chegue ao hidrante 
com o balde vazio

# Objetivo

Este projeto tem por objetivo ser uma implementação prática do Toy Problem 2 utilizando Java e JavaFX.

# Estrutura do projeto
- View: Utiliza JavaFX para criar a interface gráfica que representa visualmente a cidade, os bombeiros, o hidrante e o incêndio.
- Controller: Gerencia todas a estrutura do e faz a simulação do automato

# Requisitos

- Java 11 ou superior
- JavaFx 11 ou superior