package net.citizensnpcs.questers.rewards;

import net.citizensnpcs.questers.Reward;
import net.citizensnpcs.questers.quests.QuestManager.RewardType;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemReward implements Reward {
	private final ItemStack reward;
	private final boolean take;

	public ItemReward(ItemStack reward, boolean take) {
		this.reward = reward;
		this.take = take;
	}

	@Override
	public void grant(Player player) {
		if (this.take) {
			// dostuff
		} else {
			player.getWorld().dropItemNaturally(player.getLocation(), reward);
		}
	}

	@Override
	public RewardType getType() {
		return RewardType.ITEM;
	}

	@Override
	public Object getReward() {
		return reward;
	}

	@Override
	public boolean isTake() {
		return take;
	}

	@Override
	public boolean canTake(Player player) {
		return take;
		// return take ? ItemInterface.hasEnough(new Payment(reward), player)
		// : true;
	}

	@Override
	public String getRequiredText(Player player) {
		// TODO Auto-generated method stub
		return null;
	}
}