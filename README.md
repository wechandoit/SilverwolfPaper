# SilverwolfPaper - An AdvancedSlimePaper fork

## Usage

Apply patches with `./gradlew applyAllPatches` and then run a dev server with `./gradlew runServer`. You can generate a mojmap jar with `./gradlew createBundlerJar`.

## How to contribute
1. You first need to have the currently applied patches with `./gradlew applyAllPatches` and then you can start working on the code.
2. If the applyAllPatches task fails, it could be because you don't have enough RAM. To fix this, refer to the "Set Gradle memory limit section.
3. Then, you can edit the code in the `silverwolfpaper-server/` folder
4. After you are done, you can save your changes to the "local git repo" with `./gradlew fixupMinecraftSourcePatches` (The task name may depend on what you are working on, eg `fixupPaperServerFilePatches`. Calling more than you need should be fine even if it throws a git error.)
5. Once all the changes are in the "local git repo", you can update the patch files with `./gradlew rebuildAllServerPatches`.

### Small notes
- If you need to change the `build.gradle.kts.patch` files, using `./gradlew rebuildAspaperSingleFilePatches` will automatically update all these patch files after modifications were made.
- The `core` and `api` modules refer to ASP's custom modules. They are not directly related to paper.

For more information, refer to [PaperMC/paperweight-examples](https://github.com/PaperMC/paperweight-examples) and [PaperMC/Paper/CONTRIBUTING.md](https://github.com/PaperMC/Paper/blob/master/CONTRIBUTING.md). (The CONTRIBUTING.md also explains how to set up the development environment)

Credits:
- The LegitSlimePaper team for the README.md format
- <details>
    <summary>Expand to see forks that SilverwolfPaper takes patches from.</summary>
    <p>
      • <a href="https://modrinth.com/mod/saturn">Saturn</a> (R.I.P.)<br>
      • <a href="https://modrinth.com/mod/pluto">Pluto</a> (R.I.P.)<br>
      • <a href="https://github.com/CaffeineMC/lithium">Lithium</a><br>
      • <a href="https://github.com/KryptonMC/Krypton">Krypton</a><br>
      • <a href="https://github.com/Winds-Studio/Leaf">Leaf</a><br>
      • <a href="https://gitlab.com/Titaniumtown/JettPack">JettPack</a> (R.I.P.)<br>
      • <a href="https://github.com/PurpurMC/Purpur">Purpur</a><br>
    </p>
</details>