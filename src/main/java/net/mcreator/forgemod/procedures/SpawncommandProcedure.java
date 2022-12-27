package net.mcreator.forgemod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class SpawncommandProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "targets")) {
				{
					Entity _ent = entityiterator;
					_ent.teleportTo((new Object() {
						public double getX() {
							try {
								return BlockPosArgument.getLoadedBlockPos(arguments, "0").getX();
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return 0;
							}
						}
					}.getX()), (new Object() {
						public double getY() {
							try {
								return BlockPosArgument.getLoadedBlockPos(arguments, "0").getY();
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return 0;
							}
						}
					}.getY()), (new Object() {
						public double getZ() {
							try {
								return BlockPosArgument.getLoadedBlockPos(arguments, "60").getZ();
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return 0;
							}
						}
					}.getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((new Object() {
							public double getX() {
								try {
									return BlockPosArgument.getLoadedBlockPos(arguments, "0").getX();
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return 0;
								}
							}
						}.getX()), (new Object() {
							public double getY() {
								try {
									return BlockPosArgument.getLoadedBlockPos(arguments, "0").getY();
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return 0;
								}
							}
						}.getY()), (new Object() {
							public double getZ() {
								try {
									return BlockPosArgument.getLoadedBlockPos(arguments, "60").getZ();
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return 0;
								}
							}
						}.getZ()), _ent.getYRot(), _ent.getXRot());
				}
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
