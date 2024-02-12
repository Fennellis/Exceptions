[Serializable]
class ParametrException : Exception
{
    public Dictionary<string,string> Dict {get;}
    public ParametrException(Dictionary<string,string> dict)
    {
        Dict = dict;
    }
}