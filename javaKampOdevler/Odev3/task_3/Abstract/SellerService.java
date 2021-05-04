package task_3.Abstract;

import task_3.Entities.Customer;
import task_3.Entities.Game;

public interface SellerService {
    void sell(Game game, Customer customer);
    void relaseGame(Game game,Customer customer);
}
