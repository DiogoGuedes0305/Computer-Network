RCOMP 2019-2020 Project - Sprint 1 planning
===========================================
### Sprint master: 1181585 ###
# 1. Sprint's backlog #
The team is enrolled in a structured cabling project, the outcome for this sprint is a structured cabling deployment plan for the given physical environment. The project owner role is assumed by the laboratory classes’ teacher.
### Physical environment description ###
The structured cabling project is to embrace an industrial private closed area with five buildings, they all have two floors. These buildings are numbered/designated as 1, 2, 3, 4, and 5.
The schematic plan shows how those buildings are implanted in the area. An underground technical ditch with cable raceways (in light blue) exists and includes cable passage ways for all buildings, it’s ready for telecommunications cabling and others.

# 2. Technical decisions and coordination #
Backbone cables to be used:
+ Copper cables (CAT6A) between the outlets and CP's and between CP's and HC's. These have the best data-rate/cost ratio, while allowing cable distances up to 90m.
+ Multimode Optic Fiber cables between HC's and IC's and between the IC's and the MC. This is because these allow high speed and high bandwidth over short distances, se it is the best fit for our project, where the greatest distance that will have to be travelled - the whole course around the technical ditch around the whole campus - is nearly 528m.
+ The formula used to calculate the number of outlets in each division will be 2 outlets per 10m^2.

## Inventory ##
### Inventory of Building 2 not included ###
| Item | Count |
|------|-------|
| Main Cross-Connect | 1 |
| Intermediate Cross-Connects | 4 |
| Horizontal Cross-Connects | 8 |
| Consolidation Points | 19 |
| CAT6A Copper Cable | 12269 meters |
| Multimode Optical Fiber Cable | 5513 meters |
| Patch Cord | 434 meters |
| 8-Port Optic Fiber Patch Panel | 3 |
| 12-Port Optic Fiber Patch Panel | 2 |
| 24-Port Optic Fiber Patch Panel | 6 |
| 128-Port Optic Fiber Patch Panel | 3 |
| 16-Port CAT6A Patch Panel | 3 |
| 24-Port CAT6A Patch Panel | 3 |
| 48-Port CAT6A Patch Panel | 12 |
| Outlets | 978 |
| Access Points (Router) | 7 |

# 3. Subtasks assignment #
+ 1181585 (Luís Tovar) - Development of a structured cabling project for building 1, and also encompassing the campus backbone.
+ 1170617 (José Guedes) - Development of a structured cabling project for building 3.
+ 1170727 (Luís Gil) - Development of a structured cabling project for building 2.
+ 1180878 (Milene Farias) - Development of a structured cabling project for building 4.
