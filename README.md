# NottAMinecraftSpiderRemover

Removes Spiders and Cave Spiders from the Minecraft Survival Mode

Note: They can still be spawned with the ```/summon minecraft:spider``` and ```/summon minecraft:cave_spider``` commands ingame

## How to Build
* Run ```.\gradlew build``` in the mod directory

Note: I have set gradle to use 2 cores and 2 threads (4 threads in total), if this is going to be a problem for you, edit the ```org.gradle.workers.max=4``` in gradle.properties

## Built With
JVM:          11.0.11 (AdoptOpenJDK 11.0.11+9)

Note: Grade 6.8.1 does not support Java 16, please use OpenJDK 11 to build the mod
OpenJDK 11 can be found here at [AdoptOpenJDK](https://adoptopenjdk.net/)

## Custom Loot Tables
<small>**1.16.5**</small>
* Zombies have a chance to Drop Spider Eyes
* Skeletons have a chance to Drop Spider Eyes and String
* Strays have a chance to Drop Spider Eyes and String
* Zombie Villagers have a chance to Drop String
* Wool Gives 4 Pieces of String
* You can make Spider Eyes with Eyes of Ender and Rotten Flesh

<small><small>v1.1 - 1.16.5</small></small>
* Added Strings and Spider Eye to
    * buried_treasure.json
    * desert_pyramid.json
    * jungle_temple.json
    * pillager_outpost.json
    * underwater_ruin_big.json
    * underwater_ruin_small.json
    * woodland_mansion.json

<small><small>v1.1.1 - 1.16.5</small></small>
* Removed System.out.println() in main source file since it clogged up the console

<small><small>v1.2 - 1.16.5</small></small>
* Added String to Village Chest Loot Tables

## Planned Changes
* Upgrade to 1.17 once the forge version releases