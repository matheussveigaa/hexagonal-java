# Spring-Boot - Hexagonal Architecture (Ports and Adapters)

Spring-Boot application based on **hexagonal architecture**

![alt hexagonal architecture / port and adapters](https://i.imgur.com/eseWVlB.png)

## Setup for development

1. Install docker;
2. Download image for mongodb **(docker pull tutum/mongodb)**;
3. Run **docker run -d -p 27017:27017 -p 28017:28017 -e AUTH=no tutum/mongodb**;
4. Create default collection, run **db.createCollection("customers")** on container cli.