long long crazyBitstring(int n, string &s, vector<int> &a)
{
    int one = 0, zero = 0;
    for (char ch : s)
        one += ch == '1';
    if (one == 0)
        return 0;
    zero = n - one;

    vector<int> ve, vi;
    for (int i = 0; i < n; i++)
    {
        if (s[i] == '1')
            vi.push_back(a[i]);
        else
            ve.push_back(a[i]);
    }

    sort(ve.begin(), ve.end());
    sort(vi.begin(), vi.end());

    if (one > zero)
        return min(accumulate(vi.begin(), vi.end(), 0LL), accumulate(ve.begin(), ve.begin() + zero, 0LL));
    return min(accumulate(ve.begin(), ve.end(), 0LL), accumulate(vi.begin(), vi.begin() + one, 0LL));
}
