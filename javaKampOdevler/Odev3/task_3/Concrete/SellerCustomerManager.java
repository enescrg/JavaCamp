package task_3.Concrete;

import task_3.Abstract.BaseSellerManager;
import task_3.Adapters.SellerServiceAdapter;
import task_3.Entities.Customer;
import task_3.Entities.Game;

public class SellerCustomerManager extends BaseSellerManager {
    SellerServiceAdapter sellerServiceAdapter;

    public SellerCustomerManager(SellerServiceAdapter sellerServiceAdapter) {
        this.sellerServiceAdapter = sellerServiceAdapter;
    }

    @Override
    public void sell(Game game, Customer customer) {
        game.setPrice(this.sellerServiceAdapter.priceAfterDiscount(game));
        super.sell(game, customer);
    }
}
