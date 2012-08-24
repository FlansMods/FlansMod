FLANS MOD for MC 1.3.2

This is the official port of Flan's Mod to 1.3.2

INFORMATION TO HELPERS

If possible with the new Forge Event system, it would be preferable to remove PlayerAPI dependecy, noting that hooks will be needed for spawning, attacking, killing and dropping items etc. for when Teams mod is added. (The data file associated with the player need not be there, as long as it is somehow stored per player)
I would also like to phase out TMT and switch to NMT (Nitro Model Thingy)
If possible, a proxy class ModelRendererTurbo extends ModelRendererNitro (or whatever its called) could be made so that old content pack models do not need recompiling.


INSTALLATION

Install MCP and Forge.
Decompile PlayerAPI in a seperate MCP folder without Forge and merge the source into the working Forge MCP folder
Simply pull the repo to your root MCP directory (a few example content packs are included in the repo) and begin work

*To get TurboModelThingy working with MC 1.3.2, simply change all instances of 'Vec3D' to 'Vec3.'*

DEPENDENCIES
MCP
Forge
PlayerAPI (for now)
(TurboModelThingy included)