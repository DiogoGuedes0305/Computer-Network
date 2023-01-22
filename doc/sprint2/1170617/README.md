RCOMP 2019-2020 Project - Sprint 2 - Member 1170617 folder
===========================================
# Building 3

## Information
- End user outlets on the ground floor: 40 nodes
- End user outlets on floor one: 44 nodes
- Wi-Fi network: 60 nodes
- Local servers, administration workstations, and industrial machines (DMZ): 250 nodes
- VoIP (IP-phones): 40 nodes

### Endereçamentos de subnetting

| VLAN        | Nodes      | Rede              | Subnet Mask     |
|:------------|------------|-------------------|-----------------|
| **3_User0** | 40         | 10.126.245.0/26   | 255.255.255.192 |
| **3_User1** | 44         | 10.126.245.64/26  | 255.255.255.192 |
| **3_Wifi**  | 60         | 10.126.245.128/26 | 255.255.255.192 |
| **3_DMZ**   | 250        | 10.126.240.0/24   | 255.255.255.0   |
| **3_VoIP**  | 35         | 10.126.245.192/26 | 255.255.255.192 |
