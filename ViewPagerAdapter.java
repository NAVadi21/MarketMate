import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter; 

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // Return the appropriate fragment based on the tab position
        switch (position) {
            case 0:
                return new ShopFragment();
            case 1:
                return new ItemShadowFragment();
            case 2:
                return new ItemShopFragment();
            case 3:
                return new AnotherFragment(); // Add more fragments as needed
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Return the total number of tabs
        return 4; // Adjust this number based on the number of tabs you want
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Return the title for each tab
        switch (position) {
            case 0:
                return "Shops";
            case 1:
                return "Shadow";
            case 2:
                return "Item Shop";
            case 3:
                return "Another"; // Add more titles as needed
            default:
                return null;
        }
    }
}
