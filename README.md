![name](https://github.com/Jakeplays12/Privstuff/blob/main/jakeplugin12.png)

```
The plan with this plugin was to learn Java better but also learn more about how Plugins/Mods works.
I used Bukkit instead of Spigot or Paper as Bukkit didnt have as much deprived API stuff.


The overall goal is to have as much as possible.
and not to have any errors.
```
### Prefixes

```
Error : §8[§2!§8]§f

Join : §8[§2+§8]§f
Leave : §8[§4-§8] §f
```

# Contents

- [Heal](./README.md#/Heal)
- [Feed](./README.md#feed)
- [Vanish](./README.md#Vanish)
- [Broadcast](./README.md#Broadcast)
- 
![Contents](https://github.com/Jakeplays12/Privstuff/blob/main/jplugin_commands_image.png)

## /Heal 
###### SmallerCommands
> Heal's the Player and Feeds them

- [x] /Heal
- [ ] Add Permissions to the command.
- [ ] Run the command with an Arg and effect selected player

## /Feed 
###### SmallerCommands
> Feeds the player

- [x] /Feed
- [ ] Add Permissions to the command.
- [ ] Run the command with an Arg and effect selected player

Enabled = §6Fly has been §2enabled §6For §r" + target.getDisplayName()
Disabled = §6Fly has been §4disabled §6For §r" + target.getDisplayName()

## /Vanish
> Hides Player from all players but Admins

- [ ] /Vanish
- [ ] Add Permissions to the command.
- [ ] Run the command with an Arg and effect selected player
- [ ] Tells OP Players that said player went into vanish

## /Broadcast
###### BroadcastCommand
> Broadcast's a message using arguments

- [x] /broadcast
- [ ] Add Permissions to the command.
- [ ] Tells OP players who ran the command

## /Fly
###### FlyCommand
> Toggles Fly for a player

- [x] /fly
- [ ] Add Permissions to the command.
- [x] Run the command with an Arg and effect selected player
- [x] (If used on another player) Sender is told otherplayer has fly, otherplayer is told sender gave them fly

> BUGS

- Gamemode changes dont get registered but reset fly

### Messages

```
Error = §8[§4!§8]§f §6Error, Player not found.

- No Arguments

Enabled = §6Fly has been §2enabled §6By §r" + player.getDisplayName()
Disabled = §6Fly has been §4disabled §6By §r " + player.getDisplayName()

- Argument for another player

Enabled (sender) = §6Fly has been §2enabled §6For §r" + target.getDisplayName()
Enabled (receiver)  = §6Fly has been §2enabled §6By §r" + player.getDisplayName()
Disabled (sender)= §6Fly has been §4disabled §6For §r" + target.getDisplayName()
Disabled (receiver) = §6Fly has been §4disabled §6By §r" + player.getDisplayName()

- Agrument for same player name

Enabled = §6Fly has been §2enabled §6For §r" + target.getDisplayName()
Disabled = §6Fly has been §4disabled §6For §r" + target.getDisplayName()
```
## /gmc, /gms, /gmsp (Shorter Gamemode Commands)
###### GamemodeCommands
> Allows players to go between Gamemode Creative & Survival & Spectator by setting permissions

**Gamemode Survival**
- [x] /gms
- [ ] Add Permissions to the commands.
- [ ] Run the command with an Arg and effect selected player
- [ ] Tells OP players they changed gamemode

**Gamemode Creative**

- [x] /gmc
- [ ] Add Permissions to the commands.
- [ ] Run the command with an Arg and effect selected player
- [ ] Tells OP players they changed gamemode

**Gamemode Spectator**

- [x] /gmsp
- [ ] Add Permissions to the commands.
- [ ] Run the command with an Arg and effect selected player
- [ ] Tells OP players they changed gamemode

## Hug
> Hugs

WIP

## Scoreboard

- [ ] Scoreboard shows
- [ ] Tell the player what rank they have
- [ ] Maybe what world they are in?

## Color Codes
###### colors
> Shows all the minecraft Color Codes and Formatting Codes

- [x] /color
- [x] /format
- [ ] Can be ran from console

## Random TP
> When command ran randomly TP's the player

WIP

## God Mode

WIP


## Idea's / Notes

