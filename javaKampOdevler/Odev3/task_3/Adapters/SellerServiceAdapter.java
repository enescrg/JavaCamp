package task_3.Adapters;

import task_3.Abstract.SellerCampaingService;
import task_3.Entities.Game;

public class SellerServiceAdapter implements SellerCampaingService {
    @Override
    public double priceAfterDiscount(Game game) {
        return game.getPrice() - (game.getPrice() * game.getDiscount()) / 100;
    }
}
