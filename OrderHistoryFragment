public class OrderHistoryFragment extends Fragment {

    private RecyclerView orderHistoryRecyclerView;
    private OrderHistoryAdapter orderHistoryAdapter;
    private List<Order> orderList;

    public OrderHistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_order_history, container, false);

        orderHistoryRecyclerView = view.findViewById(R.id.orderHistoryRecyclerView);
        orderList = getOrderList(); // Populate the order list with data

        orderHistoryAdapter = new OrderHistoryAdapter(orderList);
        orderHistoryRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        orderHistoryRecyclerView.setAdapter(orderHistoryAdapter);

        return view;
    }

    // Dummy method to populate the order list with data
    private List<Order> getOrderList() {
        List<Order> orderList = new ArrayList<>();

        // Add sample orders
        orderList.add(new Order("Order 1", "2023-06-01", "Delivered"));
        orderList.add(new Order("Order 2", "2023-05-28", "Cancelled"));
        orderList.add(new Order("Order 3", "2023-05-15", "Delivered"));
        // Add more orders as needed

        return orderList;
    }
}
