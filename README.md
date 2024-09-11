# GR Code Club

Please work on a branch

## Setup

### Install all the apps and make sure they are all in the start menu and pinned to the task bar.
* Install [MCreator 2024.2](https://mcreator.net/download/2024-2)
* Install [Github Desktop](https://central.github.com/deployments/desktop/desktop/latest/win32)
* Install [Block Bench](https://www.blockbench.net/downloads)
* Install [Curseforge Standalone](https://www.curseforge.com/download/app)
* Install [IntelliJ Community Edition](https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC)

### Github Desktop
* Log in to the correct account (`codeclub2023<machineNumber>`)
    * If it doesn't exist you may need to make it and an associated `codeclub2023<machineNumber>@outlook.com` email.
    * If you don't see the repo or had to create it you'll need to login to Github as gr-codeclub and add the account to the repository.
* Check out https://github.com/gr-codeclub/minecraft-codeclub-2024 main branch into `C:\minecraft-codeclub-2024`
* Make sure the folder is empty other than the README.md and .gitignore.
* Make a new folder named `codeclub2023<machineNumber>`
* Make a new branch named `codeclub2023<machineNumber>`

### MCreator
* Open MCreator
* Click "New Workspace"
  * Change the settings
    * Pick NeoForge on the left
    * Mod name to `codeclub20233<machineNumber>`
    * Mod id to `codeclub20233<machineNumber>`
    * Mod java package name to `net.mcreator.codeclub2023<machineNumber>`
    * Workspace folder to `C:\minecraft-codeclub\codeclub20233`
* Let it import
* Click the little arrow on the far left to get to the files so you can change the gradle files.

#### gradle.properties

```
# The Minecraft version the Parchment version is for
neogradle.subsystems.parchment.minecraftVersion=1.20.6
## The version of the Parchment mappings
neogradle.subsystems.parchment.mappingsVersion=2024.06.16
```

#### Run it

* Click the little build hammer in the top right
* Click the little green play button in the top right (this should start minecraft if all went well)
* Click Single PLayer
* Click Create New World
* Make sure it is set to Creative mode and that cheats are ON
* Click Generate
* Make sure you can load into the world, then save and exit.

### IntelliJ
* Open IntelliJ
* Install or update the Minecraft plugin
* Click new project and make sure Java 21 (Temurin) is there in the JDK dropdown. If not:
    * Choose download jdk
    * Choose version 21
    * Choose Eclipse Temurin as the Vendor
    * Hit download
* Restart IntelliJ and this time, open an existing project
    * Go and find your new MCreator project in `C:\minecraft-codeclub\codeclub2023<machineNumber>`
    * Choose Gradle as the project type NOT Eclipse.
    * Wait for it to import
        * If it fails, just make it try again by opening the build.gradle file and clicking the little elephant in the top right.
            * There is also a gradle sidebar where you can hit a refresh icon instead if this isn't working.
    * Click through the gradle sidebar on the right hand side `<yourProject>/Tasks/forgegradle runs` and double click `runClient`
    * Wait for Minecraft to start
    * Shut Minecraft down

### Curseforge
* Open Curseforge
* Clear any previous profiles
* Click "Create Custom Profile" and call it CodeClub2023
* Select versions matching the versions from MCreator (1.20.1 + NeoForge 20.6.117	)
* Click create
* Click play
* Check in the top left you are signed in as the correct account `codeclub2023<machineNumber>`
    * If not, sign out if necessary, and sign in again
        * Use the Microsoft Login `codeclub2023<machineNumber>@outlook.com`
* If prompted to make a gamertag, do so. `codeclub2023<machineNumber>` ideally but it doesn't really matter.
* If your account does not already own Minecraft
    * Click on buy
    * Buy the Bedrock + Java Edition, we only care about Bedrock but they don't sell it separately any more. Don't get the Deluxe one.
    * You will need to restart the Minecraft launcher for it to realise you own it.
* Open Minecraft to make sure it launches successfully.

### Finishing off
* Commit the project to your new branch
* Push it.
    * If you don't have push permissions, log in to GitHub as gr-codeclub and add the account to the repository.

### Windows updates
Make sure it's up to date
