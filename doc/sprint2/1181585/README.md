RCOMP 2020-2021 Project - Sprint 2 - Member 1181585 folder
===========================================

## Correções do Sprint 1
+ As ligações do backbone. Tinha decidido ligar cada IC apenas aos IC vizinhos, o que permititia poupar cabo e manter a redundância, mas não respeitaria a hierarquia de backbone de uma estrutura cablada correta. Por isso, vai-se ligar o MC a cada IC pelos dois lados para haver redundância no caso de haver bloqueio físico de um lado. Mesmo com distâncias aumentadas, continuou a não se justificar a utilização de fibra monomodo.
+ O inventário, onde foram incluídos dispositivos físicos, e não lógicos. Também se contaram os bastidores e quantidade de calha necessária.

## Sprint 2

### Definição das VLANs do edifício

        ID  - Nome
        365 - 1_User0
        366 - 1_User1
        367 - 1_Wifi
        368 - 1_DMZ
        369 - 1_VoIP
        385 - Campus
