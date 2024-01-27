int maximumscore(int n, vector<int> v)
{
    sort(v.begin(), v.end());
    return v[n / 2] + v[0];
}