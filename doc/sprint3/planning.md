RCOMP 2020-2021 Project - Sprint 3 planning
===========================================

### Sprint master: 1170617 ###
# 1. Sprint's backlog #


- T.3.1 - Luís Tovar(1181585) - Update the campus.pkt layer three Packet Tracer simulation from the previous sprint, to include the described features in this sprint for
building 1.

- T.3.2 - Luís Gil(1170727) - Update the campus.pkt layer three Packet Tracer simulation from the
previous sprint, to include the described features in this sprint for
building 2. Final integration of each member’s Packet Tracer simulation into a
single simulation.

- T.3.3 - Diogo Guedes(1170617) - Update the campus.pkt layer three Packet Tracer simulation from the previous sprint, to include the described features in this sprint for
building 3.

- T.3.4 - Milene Farias(1170878) - Update the campus.pkt layer three Packet Tracer simulation from the previous sprint, to include the described features in this sprint for
building 4.


# 2. Technical decisions and coordination #


## OSPF dymanic routing

- Os static routing serão apagados em todos os routers e as tabelas de routing existentes serão apagadas também, com a exepção do default router do edifício A.

- A infraestutura passará a ser um domínio OSPF (Sistema Autónomo) e será distribuído em áreas, uma para cada edifício e uma para o backbone.

- A área respectiva ao backbone contém apenas uma network IPv4 e a vlan respetiva ao backbone. Para cada edifício será atribuída um id correspondente a uma área e cada uma dessas áreas irá conter todas as networks IPv4 contidas no edifício correspondente.

- No momento do Planning foi definido que para AREA-NUMBER do OSPF adotar a seguinte nomenclatura:

  - Área de id 0 para o BackBone;

  - Área de id 1 para o Edifício A;

  - Área de id 2 para o Edifício B;

  - Área de id 3 para o Edifício C;

  - Área de id 4 para o Edifício D;

## VoIP service
- Optamos por utilizar apenas números com 3 dígitos e o número de nós necessários é sempre entre 10 e 99. Assim, os números de linha atribuídos para cada edifício foram os seguintes:
    - Edifício 1: 100 - 119
    - Edifício 2: 200 - 219
    - Edifício 3: 300 - 319
    - Edifício 4: 400 - 419

## DNS
Os Ips para cada edifício são:
    - Edificio 1: 10.126.240.1
    - Edificio 2: 10.126.240.2
    - Edificio 3: 10.126.240.3
    - Edificio 4: 10.126.240.4
E usamos a seguinte nomenclatura para os domain name:

      - rcomp-20-21-dn-01



# 3. Subtasks assignment #

  - 1181585 - Configurar OSPF, servidores HTTP, serviço DHCPv4, serviço VoIP, DNS, NAT e Static Firewall para o Edifício 1.
  - 1170727 -  Juntar os edificios no campus, Configurar OSPF, servidores HTTP, serviço DHCPv4, serviço VoIP, DNS, NAT e Static Firewall para o Edifício 2.
  - 1170617 - Configurar OSPF, servidores HTTP, serviço DHCPv4, serviço VoIP, DNS, NAT e Static Firewall para o Edifício 3.
  - 1170878 - Configurar OSPF, servidores HTTP, serviço DHCPv4, serviço VoIP, DNS, NAT e Static Firewall para o Edifício 4.
