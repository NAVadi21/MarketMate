public class CartFragment extends Fragment {

    private RecyclerView cartRecyclerView;
    private CartAdapter cartAdapter;
    private List<Item> cartItemList;

    public CartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        cartRecyclerView = view.findViewById(R.id.cartRecyclerView);
        cartItemList = getCartItemList(); // Populate the cart item list with data

        cartAdapter = new CartAdapter(cartItemList);
        cartRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        cartRecyclerView.setAdapter(cartAdapter);

        return view;
    }

    // Dummy method to populate the cart item list with data
    private List<Item> getCartItemList() {
        List<Item> cartItemList = new ArrayList<>();

        // Add sample cart items
        cartItemList.add(new Item("Item 1", "Category 1", 10.99));
        cartItemList.add(new Item("Item 2", "Category 2", 15.99));
        cartItemList.add(new Item("Item 3", "Category 1", 12.99));
        // Add more items as needed

        return cartItemList;
    }
}
