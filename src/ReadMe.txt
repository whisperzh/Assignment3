# CS611-Assignment #3
## Legend: Monster and Heroes
---------------------------------------------------------------------------


## Files
---------------------------------------------------------------------------
1. `Main.java` -> The class is the entry point to the game and contains the main() method.

### AttributesItems package
1. `Color.java` -> color constants
2. `Dice.java` -> Dices, can be rowed
3. `Equipment.java` -> Concrete class of a hero's equipment
4. `LMH_Constant.java` -> Constant variables for game LHM
5. `LMH_DataCenter.java` -> Data center, player can get data easily from here
6. `LMH_HeroSkill.java` -> Hero's attributes
7. `Vector2.java` -> A 2d data type
8. `Wallet.java` -> a standard wallet
 
### Battle package
1. `IBattle.java` -> Encapsulated all of the battle methods
2. `LMH_Battle.java` -> concrete class of battle
 
### Board package
1. `IBoard.java` -> Encapsulated all of the board methods
2. `LMH_board.java` -> concrete board for Legends: Monsters and Heroes game
3. `MovableBoard.java` -> a board which enables pieces to move
 
### Buff package
1. `ABuff.java` -> Buff which gives positive feedback
2. `Debuff.java` -> negative buff
3. `IBuff.java` -> Encapsulated all of the Buff methods
 
### Characters package
1. `CharacterCollection.java` -> An concrete collection class used for store Characters.
2. `Dragon.java` -> monster dragons
3. `ExoSkeleton.java` -> monster ExoSkeletons
4. `GeneralHero.java` -> An abstract Hero class, with common Hero attributes
5. `GeneralMonster.java` -> An abstract monster class, with common monster attributes
6. `ICharacter.java` -> Encapsulated all of the Character methods
7. `Paladins.java` -> hero Paladins
8. `Sorcerers.java` -> hero Sorcerers
9. `Spirit.java` -> monster spirits
10. `Warriors.java` -> hero warriors
 
### Enums package
1. `CharacterAttributeEnum.java` -> All of the character attribute types
2. `GameEnum.java` -> All of the game type that this project has
3. `HeroEnum.java` -> All of the hero types
4. `ItemEnum.java` -> All of the item types
5. `LMHGridEnum.java` -> All of the LMH grid status
6. `MonsterEnum.java` -> All of the monster types
7. `SpellEnum.java` -> type of spells
8. `ViewEnum.java` -> type of views
 
### Factories package
1. `GameBoardFactory.java` -> Factory that produce Game Board
2. `GameFactory.java` -> Factory that produce Games
3. `HeroFactory.java` -> Factory that produces heroes
4. `ItemFactory.java` -> Factory that produce items
5. `MonsterFactory.java` -> Factory which produce monsters
6. `PlayerFactory.java` -> Factory which used for create players
7. `ViewFactory.java` -> Factory that produces views
 
### FunctionInterfaces package
1. `IGridContent.java` -> The Interface of grid content,namely, what object is in the grid
 
### Game package
1. `BoardGame.java` -> The abstract board game class
2. `GameController.java` -> The controller of the game
3. `IGame.java` -> Encapsulated all of the Game methods
4. `LMH_Game.java` -> The concrete class of LMH game
 
### Grid package
1. `GridCollections.java` -> The abstract class that store grids of a board game
2. `GridSpace.java` -> Encapsulated all of the Grid Space(cell) methods
3. `LMH_Grid.java` -> The concrete class of grid, used for LMH
4. `LMH_GridCollections.java` -> The concrete grid collection class of LMH
 
### Inventory package
1. `CharacterInventory.java` -> Character' Inventory, can store items
2. `IInventory.java` -> Encapsulated all of the inventory methods
3. `MarketInventory.java` -> Markets' Inventory, can store items, and can import items in batch
 
### Item package
1. `Armor.java` -> Armors
2. `ConsumableItem.java` -> Abstract class of consumable items, contains time of use decrease method
3. `FireSpell.java` -> The spell that will decrease the victim's defense
4. `IceSpell.java` -> The spell that will decrease the victim's damage
5. `IItem.java` -> Encapsulated all of the item methods
6. `LighteningSpell.java` -> The spell that will decrease the victim's agility
7. `Potion.java` -> Potions, can increase character's attributes
8. `SingleUsedItem.java` -> Abstract class of single used items, set time of use to 1 at the beginning
9. `Spell.java` -> The super class of specific spells
10. `UnwearableItem.java` -> Abstract class of items,which cannot be used out
11. `Weapon.java` -> General Weapons class can be equipped by character
 
### Judge package
1. `BoardGameJudge.java` -> An abstract class of board game Judgement
2. `IGameJudge.java` -> The interface of game judge, do judge for transaction, game over and etc
3. `LMH_Judge.java` -> The concrete class of judge in LMH game
 
### Market package
1. `IMarket.java` -> The interface used to encapsulate all of the methods of market
2. `LMH_Market.java` -> The concrete market class for LMH game only.
 
### Players package
1. `BoardGamePlayer.java` -> The abstract class of players,and this class should be the player who play on board only
2. `IPlayer.java` -> Encapsulate all of the Methods of a single player.
3. `LMH_Player.java` -> Concrete class of Board Game PLayer
4. `LMH_PlayerCollection.java` -> Concrete class of LMH player collection, encapsulate all of the LMH player, which is easy to maintain
5. `PlayerCollection.java` -> Abstract class of player collection, encapsulate all of the player, which is easy to maintain
 
### Team package
1. `ITeam.java` -> Team interface,which contains all the common methods of a team (Encapsulation)
2. `LMH_CharacterCollection.java` -> The concrete class that store characters
3. `LMH_Team.java` -> Concrete team class of LMH
4. `SimpleCollection.java` -> An abstract collection class used for store Characters.
5. `Team.java` -> Team Concrete class, Only store Players
 
### Util package
1. `ACSII_PatternParser.java` -> An parser used to parse ASCII art
2. `CharacterAttributeParser.java` -> An item used to read the info from the folder, especially for Characters
3. `IConfigParser.java` -> The Interface for all of my parsers(Encapsulation)
4. `ItemParser.java` -> An item used to read the info from the folder, especially for items
5. `ParseCollection.java` -> Collection for all same type parse, easy to maintain with
 
### Views package
1. `AbsGameView.java` -> An abstract class used for displaying. Encapsulated tons of output Info.
2. `BoardView.java` -> The view component of the board, used to show the board
3. `GameControllerView.java` -> View component of GameController, do collect and show notifications for players to choose a game
4. `LMH_BattleView.java` -> View component for Battle, show common notifications in battle
5. `LMH_BoardView.java` -> The view component of the board of the Game LMH, used to show the board
6. `LMH_GameView.java` -> The concrete game view class for LMH
7. `MainView.java` -> Part of the ood design, the view of main
8. `MarketView.java` -> The view component for market
9. `ShortInput.java` -> My own input interface
10. `ShortOutput.java` -> my own output interface
11. `View.java` -> Universal visual module, can be used in any of my program
12. `VisualModule.java` -> Interface that has both I and O
 

## Notes
---------------------------------------------------------------------------
1. Notes to grader -> NIL

## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directory `src` after unzipping the files
2. Run the following instructions:
>`javac -Xlint:unchecked -d bin com\ood\Main.java`
>`java -cp bin com.ood.Main`

## Input/Output Example
---------------------------------------------------------------------------
```
Press [0] to play <Legends: Monsters and Heroes>
                              ^    ^
                            / \  //\
              |\___/|      /   \//  .\
              /O  O  \__  /    //  | \ \
              /     /  \/_/    //   |  \  \
              @___@'    \/_   //    |   \   \
                |       \/_ //     |    \    \
                |        \///      |     \     \
                _|_ /   )  //       |      \     _\
              '/,_ _ _/  ( ; -.    |    _ _\.-~        .-~~~^-.
              ,-{        _      `-.|.-~-.           .~         `.
                '/\      /                 ~-. _ .-~      .-~^-.  \
                  `.   {            }                   /      \  \
                .----~-.\        \-'                 .~         \  `. \^-.
                ///.----..>    c   \             _ -~             `.  ^-`   ^-_
                  ///-._ _ _ _ _ _ _}^ - - - - ~                     ~--,   .-~
              /
       ,~~   /
   _  <=)  _/_
  /I\.="==.{>
  \I/-\T/-'
      /_\
     // \\_
    _I    /



0
your input: 0
========================================================================================
Please input count of players
Please input a number between [ 1 ~ 3 ]
1
your input: 1
========================================================================================
Please enter a name for the player
2
your input: 2
========================================================================================
========================================================================================
Paladins.txt
========================================================================================
index   Name                  mana   strength   agility   dexterity   starting money   starting experience   Character type
[0]     Parzival              300    750        650       700         2500             7                     PALADIN
[1]     Sehanine_Moonbow      300    750        700       700         2500             7                     PALADIN
[2]     Skoraeus_Stonebones   250    650        600       350         2500             4                     PALADIN
[3]     Garl_Glittergold      100    600        500       400         2500             5                     PALADIN
[4]     Amaryllis_Astra       500    500        500       500         2500             5                     PALADIN
[5]     Caliber_Heist         400    400        400       400         2500             8                     PALADIN
========================================================================================


Sorcerers.txt
========================================================================================
index   Name                  mana   strength   agility   dexterity   starting money   starting experience   Character type
[6]     Rillifane_Rallathil   1300   750        450       500         2500             9                     SORCERER
[7]     Segojan_Earthcaller   900    800        500       650         2500             5                     SORCERER
[8]     Reign_Havoc           800    800        800       800         2500             8                     SORCERER
[9]     Reverie_Ashels        900    800        700       400         2500             7                     SORCERER
[10]    Kalabar               800    850        400       600         2500             6                     SORCERER
[11]    Skye_Soar             1000   700        400       500         2500             5                     SORCERER
========================================================================================


Warriors.txt
========================================================================================
index   Name                mana   strength   agility   dexterity   starting money   starting experience   Character type
[12]    Gaerdal_Ironhand    100    700        500       600         1354             7                     WARRIOR
[13]    Sehanine_Monnbow    600    700        800       500         2500             8                     WARRIOR
[14]    Muamman_Duathall    300    900        500       750         2546             6                     WARRIOR
[15]    Flandal_Steelskin   200    750        650       700         2500             7                     WARRIOR
[16]    Undefeated_Yoj      400    800        400       700         2500             7                     WARRIOR
[17]    Eunoia_Cyn          400    700        800       600         2500             6                     WARRIOR
========================================================================================


========================================================================================
How many Characters can a player have?
Please input a number between [ 1 ~ 3 ]
1
your input: 1
========================================================================================
2, Please choose your hero!
Please input a number between [ 0 ~ 17 ]
6
your input: 6
========================================================================================
  0    1    2    3    4    5    6    7
+----+----+----+----+----+----+----+----+
|PLY |OBS |OBS |    |    |MAR |MAR |MAR |	 0
+----+----+----+----+----+----+----+----+
|    |    |OBS |    |    |    |OBS |MAR |	 1
+----+----+----+----+----+----+----+----+
|    |    |MAR |MAR |    |OBS |OBS |    |	 2
+----+----+----+----+----+----+----+----+
|    |MAR |    |    |    |    |MAR |    |	 3
+----+----+----+----+----+----+----+----+
|    |MAR |    |    |OBS |OBS |MAR |MAR |	 4
+----+----+----+----+----+----+----+----+
|    |OBS |MAR |MAR |OBS |OBS |    |    |	 5
+----+----+----+----+----+----+----+----+
|MAR |    |    |    |    |    |MAR |    |	 6
+----+----+----+----+----+----+----+----+
|    |    |    |    |    |MAR |MAR |    |	 7
+----+----+----+----+----+----+----+----+
On this map
OBS stands for OBSATACLES
MAR stands for MARKET
PLY stands for PLAYER_ICON

You are at : row 0 col 0
========================================================================================
2, It's your turn!
========================================================================================
Please input an action
W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
M/m: enter market
s
your input: s
========================================================================================
  0    1    2    3    4    5    6    7
+----+----+----+----+----+----+----+----+
|MAR |OBS |OBS |    |    |MAR |MAR |MAR |	 0
+----+----+----+----+----+----+----+----+
|PLY |    |OBS |    |    |    |OBS |MAR |	 1
+----+----+----+----+----+----+----+----+
|    |    |MAR |MAR |    |OBS |OBS |    |	 2
+----+----+----+----+----+----+----+----+
|    |MAR |    |    |    |    |MAR |    |	 3
+----+----+----+----+----+----+----+----+
|    |MAR |    |    |OBS |OBS |MAR |MAR |	 4
+----+----+----+----+----+----+----+----+
|    |OBS |MAR |MAR |OBS |OBS |    |    |	 5
+----+----+----+----+----+----+----+----+
|MAR |    |    |    |    |    |MAR |    |	 6
+----+----+----+----+----+----+----+----+
|    |    |    |    |    |MAR |MAR |    |	 7
+----+----+----+----+----+----+----+----+
========================================================================================
Ready, Fight!
========================================================================================
Rillifane_Rallathil, it's your turn!
Please input an action
A/a: Attack!
I/i: Open your inventory
Q/q: quit game
V/v: view Statistics
a
your input: a
========================================================================================
Please choose a monster to attack
========================================================================================
index   name           HP      defense
[0]     Natsunomeryu   100.0   200.0
========================================================================================
Please input a number between [ 0 ~ 0 ]
0
your input: 0
========================================================================================
========================================================================================
Natsunomeryu died
========================================================================================
Rillifane_Rallathil attacked the Natsunomeryu for 100.0 damage!
========================================================================================
The Battle is over
You are at : row 1 col 0
========================================================================================
2, It's your turn!
========================================================================================
Please input an action
W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
M/m: enter market
q
your input: q
========================================================================================
========================================================================================
-----------------------GAME OVER-----------------------
========================================================================================
========================================================================================
-------------------------BYE-------------------------

Process finished with exit code 0

```
