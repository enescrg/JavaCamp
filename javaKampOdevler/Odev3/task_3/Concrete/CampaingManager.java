package task_3.Concrete;

import task_3.Abstract.BaseCampaingManager;
import task_3.Adapters.SellerServiceAdapter;
import task_3.Entities.Customer;
import task_3.Entities.Game;

public class CampaingManager extends BaseCampaingManager {
    SellerServiceAdapter sellerServiceAdapter;

    public CampaingManager(SellerServiceAdapter sellerServiceAdapter) {
        this.sellerServiceAdapter = sellerServiceAdapter;
    }

    @Override
    public void update(Game game, Customer customer) {
        game.setPrice(this.sellerServiceAdapter.priceAfterDiscount(game));
        super.update(game, customer);
    }
}
